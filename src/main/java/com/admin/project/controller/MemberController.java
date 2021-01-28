package com.admin.project.controller;

import com.admin.project.Service.MemberService;
import com.admin.project.model.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class MemberController {

    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/member/signup")
    public String signupForm(Model model) {
        model.addAttribute("member", new Member());
        return "/member/signup";
    }

    @PostMapping("/member/signup")
    public String signup(Member member) {
        memberService.signUp(member);
        return "redirect:/";
    }

    @GetMapping("/member/login")
    public String login() {
        return "/member/login";
    }

}
