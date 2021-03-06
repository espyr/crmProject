package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.dto.*;

import java.util.List;

/**
 * The interface OfferedRequestedReport service.
 */
public interface ReporterService {
    /**
     * Method for the most offered skills by applicants.
     *
     * @return list of most offered skills by applicants.
     */
    List<OfferedRequestedReport> getOffered();

    /**
     * Mathod for the most requested skills by the companies.
     *
     * @return list of the most requested skills by the job offers
     */
    List<OfferedRequestedReport> getRequested();

    /**
     * Mathod for the skills that not applicant matched.
     *
     * @return list of the skills that not applicants matched and was requested by the job offers
     */
    List<ReportNotMatched> getNotMatchedByApplicants();

    /**
     * Method for the matching of applicant and job offer
     *
     * @return list of the matches between tha applicant and job offer
     */
    List<MatchedReport> getMatchedReport();
    /**
     * Method for the finalised matches
     *
     * @return list of the 20 recent finalised matches
     */
    List<FinalisedMatches> getFinalisedMatches();
    /**
     * Method for the finalised matches for monthly report
     *
     * @return list of the finalised matches based on month
     */
    List<MatchByMonth> getFinalisedByMonth();
    /**
     * Method for the finalised matches for weekly report
     *
     * @return list of the finalised matches based on week
     */
    List<MatchByWeek> getFinalisedByWeek();
}
