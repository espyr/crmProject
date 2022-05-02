package gr.crmproject.crmproject.controller;

import gr.crmproject.crmproject.iohelper.Helper;
import gr.crmproject.crmproject.iohelper.ResponseMessage;
import gr.crmproject.crmproject.services.ImportDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * The type Upload controller.
 */
@RestController
public class UploadController {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(UploadController.class);
    @Autowired
    private ImportDataService importDataService;

    /**
     * Upload file class.
     *
     * @param file with import data
     * @return UNDER CONSTRUCTION
     */
    @PostMapping("upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";

        if (Helper.hasExcelFormat(file)) {
            try {
                importDataService.save(file);
                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + e.getMessage() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload an excel file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
    }

}
