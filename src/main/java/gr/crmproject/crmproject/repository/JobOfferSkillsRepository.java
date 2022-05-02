package gr.crmproject.crmproject.repository;

import gr.crmproject.crmproject.models.ApplicantSkills;
import gr.crmproject.crmproject.models.JobOfferSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobOfferSkillsRepository extends JpaRepository<JobOfferSkills, Integer> {
    Optional<JobOfferSkills> findJobOfferSkillsByJobOfferAndSkills(int jobOfferId, int skillsId);
}
