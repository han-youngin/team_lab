package site.metacoding.game.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.game.domain.rpg.Rpg;
import site.metacoding.game.domain.rpg.RpgRepository;

@RequiredArgsConstructor
@Service
public class RpgService {
    private final RpgRepository rpgRepository;

    public List<Rpg> 알피지상태() {
        List<Rpg> rstate = rpgRepository.findAll();
        System.out.println(rstate);
        return rstate;
    }

}
