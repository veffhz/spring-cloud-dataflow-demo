# Demo Spring DataFlow sink

#### requirements:
java 8, maven.

#### build
`mvn clean package`

#### register new app

http://host:9393/dashboard/#/apps/add/register

name: customTimeSink
type: sink
URI: file:///home/user/custom-cloud-sink-1.0-SNAPSHOT.jar 
(or URI: maven://org.example:custom-cloud-sink:1.0-SNAPSHOT)

#### create new stream

http://host:9393/dashboard/#/streams/create

definition: http|customTimeSink
name: customTimeSinkStream

goto http://host:9393/dashboard/#/streams/definitions/customTimeSinkStream/deploy

set http port 8086 and path /api/sink

#### test stream

POST 14-10-2019 to host:8086/api/sink

log write:
```
2019-10-14 18:30:27.093  INFO 9095 --- [imeSinkStream-1] customcloudsink.sink.LoggerSink          : Received: 14-10-2019
```
