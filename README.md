##Purpose
 測試17ce 網站

## Requirements
JDK 8 above


## Spring boot framework integrate 3rd tools

run in command mode , needs install gradle 4.7 version above 

     
 * java -jar speed-test.jar -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseParallelGC  -XX:MaxGCPauseMillis=100 -XX:+UseAdaptiveSizePolicy
 
 
## undertow graceful shotdown cli
 
 post  
 * curl --header "Content-Type: application/json" -X POST http://localhost:8080/json --data '{"website":"www.w686.net","type":"http"}'
 
 shutdown cli
 * curl -X POST http://localhost:8080/actuator/shutdown 
 
 health check cli 'till server response Connection refused 
 * curl -X GET http://localhost:8080/actuator/health
    curl: (7) Failed to connect to localhost port 8080: Connection refused