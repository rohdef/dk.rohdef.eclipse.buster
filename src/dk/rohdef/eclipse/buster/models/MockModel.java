package dk.rohdef.eclipse.buster.models;

import java.util.ArrayList;
import java.util.List;

public class MockModel {
	public List<TestSuite> getCategories() {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n" +
				"<testsuites>\r\n" +
				"<testsuite errors=\"0\" tests=\"2\" time=\"0.001\" failures=\"0\" name=\"Chrome 27.0.1453.81, Linux\">\r\n" +
				"        <testcase time=\"0.011\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Normal success\"/>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Another success\"/>\r\n" +
				"    </testsuite>\r\n" +
				"    <testsuite errors=\"0\" tests=\"6\" time=\"0\" failures=\"3\" name=\"Chrome 27.0.1453.81, Linux\">\r\n" +
				"        <testcase time=\"0.269\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Normal success\"/>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Another success\"/>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Simple failure\">\r\n" +
				"            <failure type=\"AssertionError\" message=\"[expect.toBe] true expected to be the same object as false\">\r\n" +
				"                Error: [assert.same] true expected to be the same object as false\r\n" +
				"                    at Object.ba.fail (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1483:25)\r\n" +
				"                    at Object.fail (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1350:12)\r\n" +
				"                    at Function.ba.(anonymous function).(anonymous function) (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1284:29)\r\n" +
				"                    at Object.ba.expectation.(anonymous function) [as toBe] (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:2036:33)\r\n" +
				"                    at Object.buster.testCase.Simple failure (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/test/foo-browser.js:11:18)\r\n" +
				"                    at asyncFunction (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:6710:19)\r\n" +
				"                    at callTestFn (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:6816:27)\r\n" +
				"                    at http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:790:27\r\n" +
				"                    at http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:790:27\r\n" +
				"                    at p.then (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:71:31)\r\n" +
				"            </failure>\r\n" +
				"        </testcase>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Auch an error\">\r\n" +
				"            <failure type=\"AssertionError\" message=\"[assert.equals] 4 expected to be equal to function () {}\">\r\n" +
				"                Error: [assert.equals] 4 expected to be equal to function () {}\r\n" +
				"                    at Object.ba.fail (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1483:25)\r\n" +
				"                    at Object.fail (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1350:12)\r\n" +
				"                    at Function.ba.(anonymous function).(anonymous function) [as equals] (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:1284:29)\r\n" +
				"                    at Object.buster.testCase.Auch an error (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/test/foo-browser.js:15:12)\r\n" +
				"                    at asyncFunction (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:6710:19)\r\n" +
				"                    at callTestFn (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:6816:27)\r\n" +
				"                    at http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:790:27\r\n" +
				"                    at http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:790:27\r\n" +
				"                    at p.then (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:71:31)\r\n" +
				"                    at Object.then (http://localhost:1111/sessions/519d7f72-26ea-4f1e-b79f-fbdf354edc37/resources/buster/bundle-0.6.js:177:11)\r\n" +
				"            </failure>\r\n" +
				"        </testcase>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Async timeout\">\r\n" +
				"            <failure type=\"TimeoutError\" message=\"test function timed out after 250ms\"></failure>\r\n" +
				"        </testcase>\r\n" +
				"        <testcase time=\"0\" classname=\"Chrome 27.0.1453.81, Linux.Some dummy browser test\" name=\"Async success\"/>\r\n" +
				"    </testsuite>\r\n" +
				"</testsuites> ";
		
		
		ArrayList<TestSuite> suites = new ArrayList<>();
		TestSuite s;
		
		s = new TestSuite("Foobar 1", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		s = new TestSuite("Foobar 2", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		s = new TestSuite("Foobar 3", 2, 1, 2, 0.53);
		s.getTestCases().add(new TestCase("T1", "", 0.25));
		s.getTestCases().add(new TestCase("T2", "", 0.28));
		suites.add(s);
		
		return suites;
	}
}
