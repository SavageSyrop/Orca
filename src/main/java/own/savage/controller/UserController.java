package own.savage.controller;

import org.springframework.web.bind.annotation.*;
import own.savage.dto.AnalysisDTO;
import own.savage.enums.SentimentType;


@RestController
public class UserController {

    // This is mock for AI analysis of text
    @GetMapping("/api/sentiment")
    public AnalysisDTO analyzeText(@RequestParam String text) {
        AnalysisDTO analysisDTO = new AnalysisDTO();

        if ((int) (Math.random() * 10 + text.length()) % 2 == 0) {
            analysisDTO.setSentiment(SentimentType.POSITIVE);
        } else {
            analysisDTO.setSentiment(SentimentType.TRASH);
        }
        return analysisDTO;
    }
}
