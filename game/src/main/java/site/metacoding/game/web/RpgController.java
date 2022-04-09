package site.metacoding.game.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RpgController {

    @GetMapping({ "/" })
    public String main(Model model) {
        return "/main";
    }
}
