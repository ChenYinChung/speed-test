##Purpose
 測試17ce 網站

## Requirements
JDK 11


## Spring boot framework integrate 3rd tools

run in command mode , needs install gradle 4.7 version above 

     
 * java -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -Xms6g -Xmx6g -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -jar speed-test.jar
 
 
## undertow graceful shotdown cli
 
 post  
 * curl --header "Content-Type: application/json" -X POST http://localhost:8080/json --data '{"website":"www.w686.net","type":"http"}'
 
 shutdown cli
 * curl -X POST http://localhost:8080/actuator/shutdown 
 
 health check cli 'till server response Connection refused 
 * curl -X GET http://localhost:8080/actuator/health
    curl: (7) Failed to connect to localhost port 8080: Connection refused