package com.ssafy.simplechat.service;

import java.util.Map;

public interface MemberService {
    boolean login(Map<String, Object> memberDto);

    boolean join(Map<String, Object> memberDto);
}
