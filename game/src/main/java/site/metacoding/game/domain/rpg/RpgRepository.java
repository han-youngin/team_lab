package site.metacoding.game.domain.rpg;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RpgRepository extends JpaRepository<Rpg, Integer> {
}
