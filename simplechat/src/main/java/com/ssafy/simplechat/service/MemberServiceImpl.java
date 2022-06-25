package com.ssafy.simplechat.service;

import com.ssafy.simplechat.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public boolean login(Map<String, Object> memberDto) {
        return false;
    }

    @Override
    public boolean join(Map<String, Object> memberDto) {
        return false;
    }
}
