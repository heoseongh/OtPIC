package com.admin.project.controller.page;

import com.admin.project.Repository.MemberRepository;
import com.admin.project.model.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 현재 로그인된 사용자의 정보를 가져오기 위함
import java.security.Principal;

@Controller
@RequestMapping("/member")
public class PageController {


    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/myPage")
    private ModelAndView home(Principal principal) throws Exception {
        Member member = memberRepository.findByusername(principal.getName()).get();
        ModelAndView mv = new ModelAndView("/member/myPage");
        mv.addObject("myInfo", member);
        return mv;
    }
}
