interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

abstract class ImageProcessor implements Filterable {
    protected String imageType;
    
    public ImageProcessor(String imageType) {
        this.imageType = imageType;
    }
    
    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to " + imageType + " image");
        System.out.println("Image processing: brightness adjustment, contrast enhancement");
    }
    
    @Override
    public void reset_filter() {
        System.out.println("Resetting filters for " + imageType + " image");
        System.out.println("Image restored to original state");
    }
}

abstract class DataAnalyzer implements Filterable {
    protected String dataType;
    
    public DataAnalyzer(String dataType) {
        this.dataType = dataType;
    }
    
    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to " + dataType + " data");
        System.out.println("Data analysis: removing outliers, normalizing values");
    }
    
    @Override
    public void reset_filter() {
        System.out.println("Resetting filters for " + dataType + " data");
        System.out.println("Data restored to original state");
    }
}

class JPEGProcessor extends ImageProcessor {
    public JPEGProcessor() {
        super("JPEG");
    }
}

class PNGProcessor extends ImageProcessor {
    public PNGProcessor() {
        super("PNG");
    }
}

class CSVAnalyzer extends DataAnalyzer {
    public CSVAnalyzer() {
        super("CSV");
    }
}

class JSONAnalyzer extends DataAnalyzer {
    public JSONAnalyzer() {
        super("JSON");
    }
}

public class Question8_Filterable {
    public static void main(String[] args) {
        JPEGProcessor jpegProcessor = new JPEGProcessor();
        CSVAnalyzer csvAnalyzer = new CSVAnalyzer();
        
        System.out.println("=== Image Processing ===");
        jpegProcessor.apply_filter("blur");
        jpegProcessor.reset_filter();
        
        System.out.println("\n=== Data Analysis ===");
        csvAnalyzer.apply_filter("noise_reduction");
        csvAnalyzer.reset_filter();
    }
}
