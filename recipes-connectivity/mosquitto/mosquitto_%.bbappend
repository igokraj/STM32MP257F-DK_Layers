FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://ca.crt file://server.crt file://server.key file://mosquitto.conf"

do_install:append() {
    install -d ${D}${sysconfdir}/mosquitto
    install -m 0644 ${WORKDIR}/mosquitto.conf ${D}${sysconfdir}/mosquitto/mosquitto.conf
    install -d ${D}${sysconfdir}/mosquitto/certs
    install -m 0644 ${WORKDIR}/ca.crt     ${D}${sysconfdir}/mosquitto/certs/
    install -m 0644 ${WORKDIR}/server.crt ${D}${sysconfdir}/mosquitto/certs/
    install -m 0600 -o mosquitto -g mosquitto ${WORKDIR}/server.key ${D}${sysconfdir}/mosquitto/certs/
}
