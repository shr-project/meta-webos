# (c) Copyright 2012  Hewlett-Packard Development Company, L.P.

SUMMARY = "The header files used to develop NPAPI plugins and browsers"
SECTION = "webos/devel"
LICENSE = "MPL-1.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-1.1;md5=1d38e87ed8d522c49f04e1efe0fab3ab"

inherit webos_public_repo
inherit webos_submissions
inherit webos_arch_indep

# corresponds to tag 0.4
SRCREV = "84cba6a49d976f938f29ab593e6c32bd14e4598e"
PV = "3.0.0-0.4"
PR = "r3"

WEBOS_GIT_TAG = "${WEBOS_SUBMISSION}"
SRC_URI = "${ISIS_PROJECT_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

do_compile() {
    # otherwise make is executed and headers staged in ${HOME}/ISIS_OUT/
    :
}

do_install() {
    # new location
    install -d ${D}${includedir}/webkit/npapi
    install -v -m 666 *.h ${D}${includedir}/webkit/npapi

    # legacy location
    # install -m 666 *.h ${D}${includedir}
    cd ${D}${includedir}
    ln -sv webkit/npapi/*.h .
}

ALLOW_EMPTY_${PN} = "1"
