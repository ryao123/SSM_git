package cn.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ssm.pojo.Provider;
import cn.ssm.service.ProviderService;

@RequestMapping("/provider")
@Controller
public class ProviderController {
    @Autowired
    private ProviderService providerService;
    
    // ������ʵķ���
    @RequestMapping(value="/provider.html",method=RequestMethod.GET)
    public String showInfo(Model model) {
        List<Provider> list = providerService.getList();
        // �����ϱ��浽����ģ����
        model.addAttribute("list", list);
        return "provider";
    }
}
