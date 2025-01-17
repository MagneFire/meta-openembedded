SUMMARY = "A native Python implementation of the DBus protocol for Twisted applications."
HOMEPAGE = "https://pypi.org/project/txdbus/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rst;beginline=32;endline=32;md5=2141358b0bce85fc45216ba91735ad50"

SRC_URI[sha256sum] = "8375a5fb68a12054f0def91af800c821fb2232949337756ed975f88d8ea2bc97"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-twisted-core"
