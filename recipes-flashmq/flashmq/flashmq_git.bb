# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   examples/plugin_libcurl/LICENSE
LICENSE = "OSL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bec396627de11f42fe63f6d500f58d7a \
                    file://examples/plugin_libcurl/LICENSE;md5=36a155ec7e0de8fc9348adb633fb64e2"

SRC_URI = "git://github.com/halfgaar/FlashMQ.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.27.3"
SRCREV = "ce92020b0c992d542179c94e9dd7d823cb86b0f9"

S = "${WORKDIR}/git"

DEPENDS = "openssl"
inherit cmake systemd
SYSTEMD_SERVICE:${PN} = "flashmq.service"
SYSTEMD_AUTO_ENABLE = "disable"
# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install:append() {
    if [ -f ${D}/lib/systemd/system/flashmq.service ] && [ "${systemd_system_unitdir}" != "/lib/systemd/system" ]; then
        install -d ${D}${systemd_system_unitdir}
        mv ${D}/lib/systemd/system/flashmq.service ${D}${systemd_system_unitdir}/
        rm -rf ${D}/lib
    fi

    # /var/log jest w RAM - katalog tworzymy przy starcie zamiast w pakiecie
    rm -rf ${D}${localstatedir}/log ${D}${localstatedir}/volatile
    install -d ${D}${nonarch_libdir}/tmpfiles.d
    echo "d /var/log/flashmq 0755 root root -" > ${D}${nonarch_libdir}/tmpfiles.d/flashmq.conf
}

FILES:${PN} += "${nonarch_libdir}/tmpfiles.d"
