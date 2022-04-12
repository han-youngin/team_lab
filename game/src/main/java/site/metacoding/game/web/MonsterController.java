package site.metacoding.game.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import site.metacoding.game.domain.monster.Monster;
import site.metacoding.game.domain.rpg.Rpg;
import site.metacoding.game.service.MonsterService;
import site.metacoding.game.service.RpgService;
import site.metacoding.game.web.api.ResponseDto;
import site.metacoding.game.web.api.dto.rpg.UpdateDto;

@Controller
@RequiredArgsConstructor
public class MonsterController {
    private final RpgService rpgService;
    private final MonsterService monsterService;

    @GetMapping({ "/battle/{id}" })
    public String rpgStart(Model model) {

        // for (int i = 0; i < state.size(); i++) {
        // state.get(i).getUserId().getNickname(); // 모든 닉네임 getter
        // }
        // state.get(1).getUserId().getNickname(); // 1번지의 닉네임 getter

        List<Rpg> rstate = rpgService.알피지상태();
        model.addAttribute("rlist", rstate);
        List<Monster> mstate = monsterService.몬스터상태();
        model.addAttribute("mlist", mstate);
        return "/battle";
    }

    @PutMapping({ "/battle/update/{id}" })
    public @ResponseBody ResponseDto<?> rpgOver(@PathVariable Integer id, @RequestBody UpdateDto updateDto,
            Model model) {
        System.out.println("들어옴");
        Rpg rpgEntity = rpgService.업데이트(id, updateDto);
        model.addAttribute("user", rpgEntity);
        return new ResponseDto<>(1, "성공", null);
    }

}