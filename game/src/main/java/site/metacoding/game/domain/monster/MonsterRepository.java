package site.metacoding.game.domain.monster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {
    @Query(value = "SELECT * FROM Monster", nativeQuery = true)
    List<Monster> mState();
}
