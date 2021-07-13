FROM openjdk:11
ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /usr/src/master-spring
COPY ./target/master-spring.jar master-spring.jar
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar master-spring.jar --spring.profiles.active${PROFILE}
