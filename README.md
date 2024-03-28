## DATA MODEL MODULE FOR DRONES MICROSERVICE

### Schema

Name : MUSALA

### Tables

1. DRONE - Store done information
2. MEDICATION - Store loaded medication item details
3. MODEL - Master data table for Drone models
4. STATE - Master data table for Drone status
5. DRONE_AUDIT - Store drone battery level via Scheduler
6. DATABASECHANGELOG - Created by Liquibase to store all executed SQL entries
7. DATABASECHANGELOGLOCK - Created by Liquibase

### Table Column Definitions

1. DRONE

<code>
SERIAL_NUMBER varchar(255) NOT NULL, <br />
&nbsp;MODEL bigint NOT NULL, <br />
&nbsp;WEIGHT int DEFAULT NULL, <br />
&nbsp;BATTERY_CAPACITY int DEFAULT NULL, <br />
&nbsp;STATE bigint NOT NULL, <br />
&nbsp;PRIMARY KEY (`SERIAL_NUMBER`), <br />
</code>

2. MEDICATION

<code>
DID bigint NOT NULL AUTO_INCREMENT, <br />
&nbsp;NAME varchar(250) DEFAULT NULL, <br />
&nbsp;WEIGHT int DEFAULT NULL, <br />
&nbsp;CODE varchar(255) DEFAULT NULL, <br />
&nbsp;IMAGE longblob, <br />
&nbsp;DRONE varchar(255) DEFAULT NULL, <br />
&nbsp;PRIMARY KEY (`DID`)
</code>

3. MODEL

<code>
DID bigint NOT NULL AUTO_INCREMENT, <br />
&nbsp;CATEGORY varchar(25) NOT NULL, <br />
&nbsp;PRIMARY KEY (`DID`)
</code>

4. STATE

<code>
DID` bigint NOT NULL AUTO_INCREMENT, <br />
&nbsp;STATUS varchar(255) NOT NULL, <br />
&nbsp;PRIMARY KEY (`DID`)
</code>

5. DRONE_AUDIT

<code>
DID bigint NOT NULL AUTO_INCREMENT, <br />
&nbsp;ID varchar(255) NOT NULL, <br />
&nbsp;SERIAL_NUMBER varchar(255) NOT NULL, <br />
&nbsp;BATTERY_CAPACITY int DEFAULT NULL, <br />
&nbsp;CHECK_TIME datetime(6) NOT NULL, <br />
&nbsp;PRIMARY KEY (`DID`)
</code>
