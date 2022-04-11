package site.metacoding.game.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void 업데이트(Rpg rpg) {
        rpgRepository.save(rpg);
    }

}