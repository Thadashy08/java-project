public class AppTest {
    public static void main(String[] args) throws Exception {
        int result = App.sum(2, 3);
        boolean passed = result == 5;

        String html = "<html><head><title>Test Report</title></head><body>";
        html += "<h1>Test Result</h1>";
        html += "<p>sum(2, 3) == 5: " + (passed ? "PASSED" : "FAILED (got " + result + ")") + "</p>";
        html += "</body></html>";

        java.nio.file.Files.write(java.nio.file.Paths.get("test-reports/report.html"), html.getBytes());
    }
}
