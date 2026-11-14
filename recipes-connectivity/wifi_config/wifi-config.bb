SUMMARY = "Automatic wlan0 Wi-Fi connection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://25-wlan.network file://wpa_supplicant-wlan0.conf"
S = "${WORKDIR}"

WIFI_SSID ??= ""
WIFI_PSK ??= ""

RDEPENDS:${PN} = "wpa-supplicant"

do_install() {
    install -d ${D}${sysconfdir}/wpa_supplicant
    install -m 0600 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/
    sed -i -e 's|@WIFI_SSID@|${WIFI_SSID}|' -e 's|@WIFI_PSK@|${WIFI_PSK}|' \
        ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf

    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/25-wlan.network ${D}${sysconfdir}/systemd/network/

    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    ln -sf ${systemd_system_unitdir}/wpa_supplicant@.service \
        ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service
}

FILES:${PN} += "${sysconfdir}"
