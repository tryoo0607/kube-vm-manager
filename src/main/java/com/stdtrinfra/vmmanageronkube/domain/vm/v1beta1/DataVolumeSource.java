package com.stdtrinfra.vmmanageronkube.domain.vm.v1beta1;

public class DataVolumeSource {

    private DataVolumeBlankImage blank;

    private DataVolumeSourceGCS gcs;

    private DataVolumeSourceHTTP http;

    private DataVolumeSourceImageIO imageio;

    private DataVolumeSourcePVC pvc;

    private DataVolumeSourceRegistry registry;

    private DataVolumeSourceS3 s3;

    private DataVolumeSourceSnapshot snapshot;

    private DataVolumeSourceUpload upload;

    private DataVolumeSourceVDDK vddk;
}
