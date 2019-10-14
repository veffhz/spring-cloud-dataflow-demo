# Demo Spring DataFlow processor

#### requirements:
java 8, maven.

#### build
`mvn clean package`

#### register new app

http://host:9393/dashboard/#/apps/add/register

name: celsiusProcessor
type: processor
URI: file:///home/user/custom-cloud-processor-1.0-SNAPSHOT.jar 
(or URI: maven://org.example:custom-cloud-processor:1.0-SNAPSHOT)

#### create new stream

http://host:9393/dashboard/#/streams/create

definition: http|celsiusProcessor|log
name: toCelsiusStream

goto http://host:9393/dashboard/#/streams/definitions/convertToCelsiusStream/deploy

set http port 8082 and path /api/convert

#### test stream

POST 212 to host:8082/api/convert

log write: `log-sink : 100`