package gr.crmproject.crmproject.repository;

import gr.crmproject.crmproject.models.ApplicantSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicantSkillsRepository extends JpaRepository<ApplicantSkills, Integer> {
    Optional<ApplicantSkills> findApplicantSkillsByApplicantAndSkills(int applicantId, int skillsId);
}
