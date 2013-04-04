# (c) Copyright 2013 LG Electronics

PRINC := "${@int(PRINC) + 2}"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://fix-lsb_release-to-work-with-busybox-head-and-find.patch"

BUILD_INFO_FILE = "${DISTRO}-release"
BUILD_DISTRIB_ID = "${@ '${WEBOS_TARGET_CORE_OS}'.capitalize()}"

do_install_append(){
    # Remove lsb-release file and directory created by parent recipe.
    rm -f ${D}${sysconfdir}/lsb-release
    rm -rf ${D}${sysconfdir}/lsb-release.d

    echo "${BUILD_DISTRIB_ID} release ${DISTRO_VERSION}-${WEBOS_DISTRO_BUILD_INFO} (${WEBOS_DISTRO_RELEASE_CODENAME})" >> ${D}${sysconfdir}/${BUILD_INFO_FILE}
}
