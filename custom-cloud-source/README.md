# Demo Spring DataFlow source

#### requirements:
java 8, maven.

#### build
`mvn clean package`

#### register new app

http://host:9393/dashboard/#/apps/add/register

name: customTimeSource
type: source
URI: file:///home/user/custom-cloud-source-1.0-SNAPSHOT.jar 
(or URI: maven://org.example:custom-cloud-source:1.0-SNAPSHOT)

#### create new stream

http://host:9393/dashboard/#/streams/create

definition: customTimeSource|log
name: customTimeSourceStream

#### test stream

log write:
```
2019-10-14 17:50:46.363  INFO 8291 --- [eSourceStream-1] log-sink                                 : 1571064646361
2019-10-14 17:50:56.365  INFO 8291 --- [eSourceStream-1] log-sink                                 : 1571064656362
```
