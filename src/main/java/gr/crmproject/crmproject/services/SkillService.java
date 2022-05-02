package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.exceptions.SkillNotFoundException;
import gr.crmproject.crmproject.models.Skills;

import java.util.List;

/**
 * The interface Skill service.
 */
public interface SkillService {
     /**
      * Gets skills.
      *
      * @return list of all skills
      */
     List<Skills> getSkills();

     /**
      * Add skills.
      *
      * @param skills the skills
      * @return new skill
      */
     Skills addSkills(Skills skills);

     /**
      * Update skill.
      *
      * @param skillId the skill id
      * @return updated skill
      * @throws SkillNotFoundException skill is not found by id
      */

    Skills updateSkills(int skillId, String name) throws SkillNotFoundException;

    /**
      * Delete skill.
      *
      * @param skillId the skill id
      * @return boolean (true if skill was deleted, false if not)
      * @throws SkillNotFoundException skill is not found by id
      */
     boolean deleteSkills(int skillId) throws SkillNotFoundException;

     /**
      * Gets skill by id.
      *
      * @param skillsId the skills id
      * @return skill specified by id
      * @throws SkillNotFoundException if skill is not found by id
      */
     Skills getSkillById(int skillsId) throws SkillNotFoundException;
}
