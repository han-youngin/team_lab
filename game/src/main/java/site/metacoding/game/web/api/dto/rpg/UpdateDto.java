package site.metacoding.game.web.api.dto.rpg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.game.domain.rpg.Rpg;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateDto {

    private Integer atk;
    private Integer hp;

    public Rpg toEntity() { // 외부에서 받은 파일명 set해서 DB 저장하기
        Rpg rpgUp = new Rpg();
        rpgUp.setHp(hp);

        return rpgUp;
    }
}
