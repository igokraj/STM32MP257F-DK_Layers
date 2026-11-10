# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   extern/l8w8jwt/lib/mbedtls/LICENSE
#   extern/l8w8jwt/lib/mbedtls/framework/LICENSE
#   nng/extern/msquic/LICENSE
#   nng/extern/msquic/src/cs/LicenseHeader.txt
#   nng/extern/msquic/submodules/clog/LICENSE
#   nng/extern/msquic/submodules/googletest/LICENSE
#   nng/extern/msquic/submodules/quictls/external/perl/Text-Template-1.56/LICENSE
#   nng/extern/msquic/submodules/quictls/gost-engine/libprov/LICENSE
#   nng/extern/msquic/submodules/quictls/krb5/doc/copyright.rst
#   nng/extern/msquic/submodules/quictls/krb5/doc/mitK5license.rst
#   nng/extern/msquic/submodules/quictls/krb5/src/include/copyright.h
#   nng/extern/msquic/submodules/quictls/krb5/src/lib/gssapi/LICENSE
#   nng/extern/msquic/submodules/quictls/krb5/src/util/ss/copyright.h
#   nng/extern/msquic/submodules/quictls/krb5/src/windows/installer/wix/lang/license.rtf
#   nng/extern/msquic/submodules/quictls/oqs-provider/LICENSE.txt
#   nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE
#   nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE.BSD
#   nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE.PSF
#   nng/extern/msquic/submodules/quictls/pyca-cryptography/vectors/LICENSE
#   nng/extern/msquic/submodules/quictls/pyca-cryptography/vectors/LICENSE.BSD
#   nng/extern/msquic/submodules/quictls/python-ecdsa/LICENSE
#   nng/extern/msquic/submodules/quictls/tlslite-ng/LICENSE
#   nng/extern/msquic/submodules/quictls/util/perl/OpenSSL/copyright.pm
#   nng/extern/msquic/submodules/xdp-for-windows/src/xdpinstaller/license.rtf
#   nng/extern/msquic/submodules/xdp-for-windows/submodules/cxplat/submodules/googletest/LICENSE
#   nng/extern/msquic/submodules/xdp-for-windows/submodules/ndis-driver-library/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-2.0-only & MIT & Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3dcc569976645c81d60ad4239718c0ea \
                    file://extern/l8w8jwt/LICENSE;md5=839ad1129d12f48e3bab96f0631b7705 \
                    file://extern/l8w8jwt/lib/acutest/LICENSE.md;md5=346682fb8a415ce7cac872155041ae2e \
                    file://extern/l8w8jwt/lib/checknum/LICENSE;md5=839ad1129d12f48e3bab96f0631b7705 \
                    file://extern/l8w8jwt/lib/checknum/tests/cmocka/COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://extern/l8w8jwt/lib/checknum/tests/cmocka/cmake/Modules/COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
                    file://extern/l8w8jwt/lib/checknum/tests/cmocka/doc/that_style/LICENSE;md5=d50446091a9341a9f0da3c9bde8c071e \
                    file://extern/l8w8jwt/lib/chillbuff/LICENSE;md5=42bbaae029b7c97904ae68edaed7084f \
                    file://extern/l8w8jwt/lib/chillbuff/lib/doxygen-awesome/LICENSE;md5=5dde851081c751a8cb18a8c75bc120cd \
                    file://extern/l8w8jwt/lib/chillbuff/tests/cmocka/COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://extern/l8w8jwt/lib/chillbuff/tests/cmocka/cmake/Modules/COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
                    file://extern/l8w8jwt/lib/chillbuff/tests/cmocka/doc/that_style/LICENSE;md5=d50446091a9341a9f0da3c9bde8c071e \
                    file://extern/l8w8jwt/lib/doxygen-awesome/LICENSE;md5=5dde851081c751a8cb18a8c75bc120cd \
                    file://extern/l8w8jwt/lib/ed25519/license.txt;md5=d0be262b494ac033b65de0c0ce2a98e8 \
                    file://extern/l8w8jwt/lib/jsmn/LICENSE;md5=5adc94605a1f7a797a9a834adbe335e3 \
                    file://extern/l8w8jwt/lib/mbedtls/LICENSE;md5=379d5819937a6c2f1ef1630d341e026d \
                    file://extern/l8w8jwt/lib/mbedtls/framework/LICENSE;md5=f7b5e9e154d83b735bf23d1b3377e34e \
                    file://nanomq/LICENSE.txt;md5=3dcc569976645c81d60ad4239718c0ea \
                    file://nanomq_cli/nftp-codec/LICENSE;md5=c77ddb1ced23b21fa5e61e5025bee31a \
                    file://nanomq_cli/nftp-codec/hashtable/LICENSE;md5=d7cc8509ab12ce8b6eb4a1399d801da6 \
                    file://nng/LICENSE.txt;md5=a41e579bb4326c21c774f8e51e41d8a3 \
                    file://nng/docs/LICENSE.adoc;md5=20b23bf58403f80120d8a395c86c03f6 \
                    file://nng/extern/msquic/LICENSE;md5=ee51f94efd0db5b258b5b1b8107fea02 \
                    file://nng/extern/msquic/src/cs/LicenseHeader.txt;md5=7f05eecf004ff09bde8fe0062dca81b0 \
                    file://nng/extern/msquic/submodules/clog/LICENSE;md5=ee51f94efd0db5b258b5b1b8107fea02 \
                    file://nng/extern/msquic/submodules/googletest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://nng/extern/msquic/submodules/quictls/LICENSE.txt;md5=c75985e733726beaba57bc5253e96d04 \
                    file://nng/extern/msquic/submodules/quictls/external/perl/Text-Template-1.56/LICENSE;md5=97c2218f01bb60644ec141f8761067e5 \
                    file://nng/extern/msquic/submodules/quictls/gost-engine/LICENSE;md5=c75985e733726beaba57bc5253e96d04 \
                    file://nng/extern/msquic/submodules/quictls/gost-engine/libprov/LICENSE;md5=65d3616852dbf7b1a6d4b53b00626032 \
                    file://nng/extern/msquic/submodules/quictls/krb5/doc/copyright.rst;md5=d14084772003d459b1be6016c90afaba \
                    file://nng/extern/msquic/submodules/quictls/krb5/doc/mitK5license.rst;md5=e56dc0a3150a1ee492072b99643f112c \
                    file://nng/extern/msquic/submodules/quictls/krb5/src/include/copyright.h;md5=b37353872be11c314e7eeff7022f8555 \
                    file://nng/extern/msquic/submodules/quictls/krb5/src/lib/gssapi/LICENSE;md5=fb6a67b437ad956f36dc306535c3ec87 \
                    file://nng/extern/msquic/submodules/quictls/krb5/src/util/ss/copyright.h;md5=fc0aedc61772058340c337b1299151cd \
                    file://nng/extern/msquic/submodules/quictls/krb5/src/windows/installer/wix/lang/license.rtf;md5=a3b68de4fa3f829f5f475017171993a3 \
                    file://nng/extern/msquic/submodules/quictls/oqs-provider/LICENSE.txt;md5=6da14524b4f84c888ff136ad109e8d6c \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE;md5=bf405a8056a6647e7d077b0e7bc36aba \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE.APACHE;md5=4e168cce331e5c827d4c2b68a6200e1b \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/LICENSE.PSF;md5=43c37d21e1dbad10cddcd150ba2c0595 \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/vectors/LICENSE;md5=8c3617db4fb6fae01f1d253ab91511e4 \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/vectors/LICENSE.APACHE;md5=4e168cce331e5c827d4c2b68a6200e1b \
                    file://nng/extern/msquic/submodules/quictls/pyca-cryptography/vectors/LICENSE.BSD;md5=5ae30ba4123bc4f2fa49aa0b0dce887b \
                    file://nng/extern/msquic/submodules/quictls/python-ecdsa/LICENSE;md5=66ffc5e30f76cbb5358fe54b645e5a1d \
                    file://nng/extern/msquic/submodules/quictls/tlsfuzzer/LICENSE;md5=8264535c0c4e9c6c335635c4026a8022 \
                    file://nng/extern/msquic/submodules/quictls/tlslite-ng/LICENSE;md5=9f1a2c9fc819aaa68332ced94e4dd815 \
                    file://nng/extern/msquic/submodules/quictls/util/perl/OpenSSL/copyright.pm;md5=6e1a1a4c7b384b191ebf8fa9b288b351 \
                    file://nng/extern/msquic/submodules/quictls/wycheproof/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
                    file://nng/extern/msquic/submodules/xdp-for-windows/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/src/xdpinstaller/license.rtf;md5=1aa765084cad6894b8131c0c50494590 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/cxplat/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/cxplat/submodules/googletest/LICENSE;md5=cbbd27594afd089daa160d3a16dd515a \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/cxplat/submodules/undocked/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/ndis-driver-library/LICENSE;md5=c85ae6929782ce8af7b6889c25f177e0 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/net-offloads/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://nng/extern/msquic/submodules/xdp-for-windows/submodules/wil/LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

SRC_URI = "gitsm://github.com/nanomq/nanomq.git;protocol=https;branch=master;lfs=0"

# Modify these as desired
PV = "1.0+git"
SRCREV = "7449168c5d3e4843420933f4b52608d9db1f27f2"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: codecov iceoryx_platform vsomeip3 MbedTLS Python3 iceoryx_hoofs PostgreSQL CycloneDDS ZeroMQ iceoryx_binding_c iceoryx_posh
# NOTE: unable to map the following pkg-config dependencies: mysqlclient
#       (this is based on recipes that have previously been built and packaged)
# NOTE: the following library dependencies are unknown, ignoring: S FuzzingEngine
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "boost openssl"

inherit cmake pkgconfig perlnative python3native

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

