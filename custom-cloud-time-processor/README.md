# Demo Spring DataFlow time format processor

#### requirements:
java 8, maven.

#### build
`mvn clean package`

#### register new app

http://host:9393/dashboard/#/apps/add/register

name: timeFormatProcessor
type: processor
URI: file:///home/user/custom-cloud-time-processor-1.0-SNAPSHOT.jar 
(or URI: maven://org.example:custom-cloud-time-processor-1.0-SNAPSHOT)

#### create new stream

http://host:9393/dashboard/#/streams/create

definition: customTimeSource|timeFormatProcessor|customTimeSink
name: TimeFullStream

goto http://host:9393/dashboard/#/streams/definitions/TimeFullStream/deploy

#### test stream

log write processor:
```
2019-10-14 19:59:11.550  INFO 10608 --- [imeFullStream-1] c.processor.DateFormatProcessor          : Got the input as 1571072351547
2019-10-14 19:59:21.554  INFO 10608 --- [imeFullStream-1] c.processor.DateFormatProcessor          : Got the input as 1571072361552
```

log write sink:
```
2019-10-14 19:59:11.555  INFO 10621 --- [imeFullStream-1] customcloudsink.sink.LoggerSink          : Received: "2019-10-14T19:59:11.547"
2019-10-14 19:59:21.557  INFO 10621 --- [imeFullStream-1] customcloudsink.sink.LoggerSink          : Received: "2019-10-14T19:59:21.552"
```