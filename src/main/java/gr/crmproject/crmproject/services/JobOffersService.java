package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.exceptions.JobOfferNotFoundException;
import gr.crmproject.crmproject.exceptions.SkillNotFoundException;
import gr.crmproject.crmproject.models.JobOffer;
import gr.crmproject.crmproject.models.JobOfferSkills;

import java.util.List;


/**
 * The interface Job offers service.
 */
public interface JobOffersService {

    /**
     * Gets job offers.
     *
     * @return list of all job offers
     */
    List<JobOffer> getJobOffers();

    /**
     * create a job offer.
     *
     * @param jobOffer job offer
     * @return new job offer
     */
    JobOffer addJobOffer(JobOffer jobOffer) throws JobOfferNotFoundException;

    /**
     * Add skills to job offer.
     *
     * @param jobOfferId the job offer id
     * @param skillId    the skill id
     * @return job offer with new skills
     * @throws JobOfferNotFoundException if job offer is not found by id
     * @throws SkillNotFoundException    if skill not found by id
     */
    JobOfferSkills addSkillsToJobOffers(int jobOfferId, int skillId) throws JobOfferNotFoundException, SkillNotFoundException;

    boolean deleteJobOffer(int jobOfferId) throws JobOfferNotFoundException;

    List<JobOffer> getJobOffer(String companyName,
                               String region, String dop , Integer skillId);
}
