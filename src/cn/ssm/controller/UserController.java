package cn.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ssm.pojo.User;
import cn.ssm.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    // ������ʵķ���
    @RequestMapping(value="/show",method=RequestMethod.GET)
    public String showInfo(Model model) {
        List<User> list = userService.getList();
        // �����ϱ��浽����ģ����
        model.addAttribute("list", list);
        return "index";
    }
}
