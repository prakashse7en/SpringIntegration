# SpringIntegrationJobSupport

Simple spring integration for routing data to database start from integration2.xml

code starts from http:inbound-gateway which is rest api call from which iam transforming to a person object which s then routed to "routerBasic" which decides which channel the data should be further sent .

In case the data received from payload contains Prakash then it goes to routerChannelOne else it goes to transformerTwo. 

Followed by database call which saves data in embedded database
