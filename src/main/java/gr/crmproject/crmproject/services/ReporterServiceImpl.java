package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.dto.*;
import gr.crmproject.crmproject.repository.ApplicantRepository;
import gr.crmproject.crmproject.repository.JobOfferRepository;
import gr.crmproject.crmproject.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporterServiceImpl implements ReporterService {
    @Autowired
    private ApplicantRepository applicantRepository;
    @Autowired
    private JobOfferRepository jobOfferRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Override
    public List<OfferedRequestedReport> getOffered() {

        List<OfferedRequestedReport> list;
        return list = applicantRepository.findOffered();
    }

    @Override
    public List<OfferedRequestedReport> getRequested() {
        List<OfferedRequestedReport> list;
        return list =jobOfferRepository.findRequested();
    }

    @Override
    public List<ReportNotMatched> getNotMatchedByApplicants() {
        List<ReportNotMatched> list;
        return list =jobOfferRepository.getNotMatchedByApplicant();
    }
    @Override
    public List<MatchedReport> getMatchedReport() {
        List<MatchedReport> list;
        return list = matchRepository.getMatchedReport();
    }
    @Override
    public List<FinalisedMatches> getFinalisedMatches() {
        List<FinalisedMatches> list;
        return list = matchRepository.getFinalisedMatches();
    }
    @Override
    public List<MatchByMonth> getFinalisedByMonth() {
        List<MatchByMonth> list;
        return list = matchRepository.getFinalisedByMonth();
    }
    @Override
    public List<MatchByWeek> getFinalisedByWeek() {
        List<MatchByWeek> list;
        return list = matchRepository.getFinalisedByWeek();
    }
}


