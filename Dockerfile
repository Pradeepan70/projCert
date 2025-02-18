# Dockerfile
FROM nimmis/apache-php5

COPY 000-default.conf /etc/apache2/sites-available/000-default.conf
COPY ./website/ /var/wwww/
COPY ./website/ /var/www/public

EXPOSE 80
EXPOSE 443

CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
