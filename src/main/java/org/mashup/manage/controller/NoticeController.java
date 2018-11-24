package org.mashup.manage.controller;

import org.mashup.manage.domain.notice.NoticeCard;
import org.mashup.manage.repository.NoticeCardDummy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class NoticeController {

    @GetMapping(value = "/notice/active/list")
    public List<NoticeCard> getActiveNotices(@RequestParam(value = "type") String type) {
        List<NoticeCard> dummy = new ArrayList<>();
        dummy.add(NoticeCardDummy.POOL.get(1L));

        return dummy;
    }

    @GetMapping(value = "/notice/list")
    public List<NoticeCard> getNotices(@RequestParam(value = "type") String type,
                                       @RequestParam(value = "page") long page,
                                       @RequestParam(value = "size") long size) {
        List<NoticeCard> dummy = new ArrayList<>();
        dummy.add(NoticeCardDummy.POOL.get(1L));

        return dummy;
    }
}
