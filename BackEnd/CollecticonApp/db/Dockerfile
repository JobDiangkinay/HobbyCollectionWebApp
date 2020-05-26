FROM postgres:10
ENV POSTGRES_USER jobhobbydb
ENV POSTGRES_PASSWORD jobhobbydb
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432