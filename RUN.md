1. cmd 
cd C:\QA
java -jar selenium-server-standalone-3.12.0.jar -role hub
2. cmd 
cd C:\QA
java -Dwebdriver.gecko.driver="C:\QA\geckodriver.exe" -jar selenium-server-standalone-3.12.0.jar -role node -hub http://localhost:4444/grid/register
