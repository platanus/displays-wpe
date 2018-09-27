include recipes-core/images/core-image-minimal.bb

IMAGE_FSTYPES = "tar.gz"

IMAGE_INSTALL_append += " \
	curl \
	fbcp \
	fontconfig \
	fontconfig-utils \
	jq \
	sthttpd \
	tslib-calibrate \
	tslib-tests \
	ttf-bitstream-vera \
	gstreamer1.0-plugins-base-alsa \
	wpebackend \
	wpebackend-rdk \
	wpeframework \
	wpeframework-plugins \
	wpewebkit \
	wpewebkit-web-inspector-plugin \
	"

VIRTUAL-RUNTIME_init_manager="busybox"
