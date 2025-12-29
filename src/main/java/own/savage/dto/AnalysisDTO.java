package own.savage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import own.savage.enums.SentimentType;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AnalysisDTO {
    private SentimentType sentiment;
}

