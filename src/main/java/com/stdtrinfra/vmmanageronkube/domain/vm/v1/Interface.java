package com.stdtrinfra.vmmanageronkube.domain.vm.v1;

import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

public class Interface {

    private int acpiIndex;

    private PluginBinding binding;

    private int bootOrder;

    private InterfaceBridge bridge;

    private DHCPOptions dhcpOptions;

    private String macAddress;

    private InterfaceMacvtap macvtap;

    private InterfaceMasquerade masquerade;

    private String model;

    @Parameter(required = true)
    private String name;

    private InterfacePasst passt;

    private String pciAddress;

    private List<Port> ports;

    private InterfaceSlirp slirp;

    private InterfaceSRIOV sriov;

    private String state;

    private String tag;
}
