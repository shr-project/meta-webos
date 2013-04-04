# (c) Copyright 2013 LG Electronics

PRINC := "${@int(PRINC) + 1}"

# Remove sysprof, because it depends on 
# 'libglade', 'gconf', 'polkit', 'consolekit', 'virtual/libx11
# and x11 is not available without x11 in DISTRO_FEATURES
RRECOMMENDS_${PN} = "\
    perf \
    trace-cmd \
    kernel-module-oprofile \
    blktrace \
    "

# Remove latencytop, because it depends on gtk+ which depends on cairo-xlib, 
# which is built only with x11 in DISTRO_FEATURES
PROFILETOOLS = "\
    oprofile \
    oprofileui-server \
    powertop \
    "

# Remove latencytop, because it depends on gtk+ which depends on cairo-xlib, 
# which is built only with x11 in DISTRO_FEATURES
BABELTRACE = ""
