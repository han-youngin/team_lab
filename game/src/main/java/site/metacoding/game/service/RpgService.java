package site.metacoding.game.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.game.domain.rpg.Rpg;
import site.metacoding.game.domain.rpg.RpgRepository;
import site.metacoding.game.web.api.dto.rpg.UpdateDto;

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
    public Rpg 업데이트(Integer id, UpdateDto updateDto) {
        Optional<Rpg> rpgOp = rpgRepository.findById(id);
        if (rpgOp.isPresent()) {
            Rpg rpgEntity = rpgOp.get();
            rpgEntity.setHp(updateDto.getHp());
            return rpgEntity;
        }
        throw new RuntimeException("유저를 찾지 못함.");
    }

}