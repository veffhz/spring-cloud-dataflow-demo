# Demo Spring DataFlow task

#### requirements:
java 8, maven.

#### build
`mvn clean package`

#### register new app

http://host:9393/dashboard/#/apps/add/register

name: customsystemlogging
type: task
URI: file:///home/user/system-logging-0.0.1-SNAPSHOT.jar

#### create new task

http://host:9393/dashboard/#/tasks/create

name: CustomSystemLoggingTask
definition: customsystemlogging

#### launch added task

http://host:9393/dashboard/#/tasks/definitions/CustomSystemLoggingTask/summary