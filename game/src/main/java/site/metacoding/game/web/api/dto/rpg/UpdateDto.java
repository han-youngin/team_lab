package site.metacoding.game.web.api.dto.rpg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.game.domain.rpg.Rpg;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateDto {
    private Integer hp;

}
