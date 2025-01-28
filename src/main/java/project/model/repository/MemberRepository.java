package project.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.model.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

    boolean existsByMmailAndMpwd(String mmail, String mpwd);
}

