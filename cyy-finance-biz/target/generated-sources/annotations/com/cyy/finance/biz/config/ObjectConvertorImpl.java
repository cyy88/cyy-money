package com.cyy.finance.biz.config;

import com.cyy.finance.biz.domain.Member;
import com.cyy.finance.biz.domain.SysMenu;
import com.cyy.finance.biz.domain.SysResource;
import com.cyy.finance.biz.domain.SysRole;
import com.cyy.finance.biz.dto.form.CreateMenuForm;
import com.cyy.finance.biz.dto.form.CreateSysResourceForm;
import com.cyy.finance.biz.dto.vo.CurrentInfoVo;
import com.cyy.finance.biz.dto.vo.GenerateMpRegCodeVo;
import com.cyy.finance.biz.dto.vo.GetMenuByIdVo;
import com.cyy.finance.biz.dto.vo.GetRoleDetailVo;
import com.cyy.finance.biz.dto.vo.GetSysResourceVo;
import com.cyy.finance.biz.dto.vo.ListRoleVo;
import com.cyy.finance.biz.dto.vo.ListSysResourceVo;
import com.cyy.finance.biz.dto.vo.ListTreeMenuVo;
import com.cyy.finance.biz.dto.vo.ListTreeSelectMenuVo;
import com.cyy.finance.biz.dto.vo.MenuDataItemVo;
import com.cyy.mybatis.help.PageInfo;
import com.cyy.wx.dto.MpQrCodeCreateResult;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T21:24:14+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_77 (Oracle Corporation)"
)
@Component
public class ObjectConvertorImpl implements ObjectConvertor {

    @Override
    public GenerateMpRegCodeVo toGenerateMpRegCodeResponse(MpQrCodeCreateResult source) {
        if ( source == null ) {
            return null;
        }

        GenerateMpRegCodeVo generateMpRegCodeVo = new GenerateMpRegCodeVo();

        generateMpRegCodeVo.setExpireSeconds( source.getExpireSeconds() );
        generateMpRegCodeVo.setUrl( source.getUrl() );
        generateMpRegCodeVo.setQrCodeUrl( source.getQrCodeUrl() );
        generateMpRegCodeVo.setTicket( source.getTicket() );

        return generateMpRegCodeVo;
    }

    @Override
    public CurrentInfoVo toCurrentInfoVo(Member source) {
        if ( source == null ) {
            return null;
        }

        CurrentInfoVo currentInfoVo = new CurrentInfoVo();

        currentInfoVo.setAvatar( source.getAvatarUrl() );
        currentInfoVo.setName( source.getName() );
        currentInfoVo.setEmail( source.getEmail() );

        return currentInfoVo;
    }

    @Override
    public ListTreeMenuVo toListTreeMenuVo(SysMenu source) {
        if ( source == null ) {
            return null;
        }

        ListTreeMenuVo listTreeMenuVo = new ListTreeMenuVo();

        if ( source.getId() != null ) {
            listTreeMenuVo.setKey( String.valueOf( source.getId() ) );
        }
        listTreeMenuVo.setTitle( source.getName() );
        listTreeMenuVo.setId( source.getId() );
        listTreeMenuVo.setIcon( source.getIcon() );
        listTreeMenuVo.setPid( source.getPid() );
        listTreeMenuVo.setPath( source.getPath() );
        listTreeMenuVo.setSort( source.getSort() );
        listTreeMenuVo.setHideInMenu( source.getHideInMenu() );

        return listTreeMenuVo;
    }

    @Override
    public List<ListTreeMenuVo> toListTreeMenuVo(List<SysMenu> source) {
        if ( source == null ) {
            return null;
        }

        List<ListTreeMenuVo> list = new ArrayList<ListTreeMenuVo>( source.size() );
        for ( SysMenu sysMenu : source ) {
            list.add( toListTreeMenuVo( sysMenu ) );
        }

        return list;
    }

    @Override
    public ListTreeSelectMenuVo toListTreeSelectMenuVo(SysMenu source) {
        if ( source == null ) {
            return null;
        }

        ListTreeSelectMenuVo listTreeSelectMenuVo = new ListTreeSelectMenuVo();

        if ( source.getId() != null ) {
            listTreeSelectMenuVo.setValue( String.valueOf( source.getId() ) );
        }
        listTreeSelectMenuVo.setTitle( source.getName() );
        listTreeSelectMenuVo.setId( source.getId() );

        return listTreeSelectMenuVo;
    }

    @Override
    public List<ListTreeSelectMenuVo> toListTreeSelectMenuVo(List<SysMenu> source) {
        if ( source == null ) {
            return null;
        }

        List<ListTreeSelectMenuVo> list = new ArrayList<ListTreeSelectMenuVo>( source.size() );
        for ( SysMenu sysMenu : source ) {
            list.add( toListTreeSelectMenuVo( sysMenu ) );
        }

        return list;
    }

    @Override
    public GetMenuByIdVo toGetMenuByIdVo(SysMenu source) {
        if ( source == null ) {
            return null;
        }

        GetMenuByIdVo getMenuByIdVo = new GetMenuByIdVo();

        getMenuByIdVo.setId( source.getId() );
        getMenuByIdVo.setPid( source.getPid() );
        getMenuByIdVo.setName( source.getName() );
        getMenuByIdVo.setPath( source.getPath() );
        getMenuByIdVo.setComponent( source.getComponent() );
        getMenuByIdVo.setIcon( source.getIcon() );
        getMenuByIdVo.setLayout( source.getLayout() );
        getMenuByIdVo.setHideInMenu( source.getHideInMenu() );
        getMenuByIdVo.setRedirect( source.getRedirect() );
        getMenuByIdVo.setSort( source.getSort() );
        getMenuByIdVo.setDisable( source.getDisable() );

        return getMenuByIdVo;
    }

    @Override
    public SysMenu toSysMenu(CreateMenuForm source) {
        if ( source == null ) {
            return null;
        }

        SysMenu sysMenu = new SysMenu();

        sysMenu.setPid( source.getPid() );
        sysMenu.setName( source.getName() );
        sysMenu.setPath( source.getPath() );
        sysMenu.setComponent( source.getComponent() );
        sysMenu.setIcon( source.getIcon() );
        sysMenu.setLayout( source.getLayout() );
        sysMenu.setHideInMenu( source.getHideInMenu() );
        sysMenu.setRedirect( source.getRedirect() );
        sysMenu.setSort( source.getSort() );

        return sysMenu;
    }

    @Override
    public SysResource toSysResource(CreateSysResourceForm source) {
        if ( source == null ) {
            return null;
        }

        SysResource sysResource = new SysResource();

        sysResource.setPid( source.getPid() );
        sysResource.setName( source.getName() );
        sysResource.setPath( source.getPath() );

        return sysResource;
    }

    @Override
    public GetSysResourceVo toGetSysResourceVo(SysResource source) {
        if ( source == null ) {
            return null;
        }

        GetSysResourceVo getSysResourceVo = new GetSysResourceVo();

        getSysResourceVo.setId( source.getId() );
        getSysResourceVo.setName( source.getName() );
        getSysResourceVo.setPid( source.getPid() );
        getSysResourceVo.setPath( source.getPath() );

        return getSysResourceVo;
    }

    @Override
    public List<ListSysResourceVo> toListSysResourceVo(List<SysResource> source) {
        if ( source == null ) {
            return null;
        }

        List<ListSysResourceVo> list = new ArrayList<ListSysResourceVo>( source.size() );
        for ( SysResource sysResource : source ) {
            list.add( sysResourceToListSysResourceVo( sysResource ) );
        }

        return list;
    }

    @Override
    public PageInfo<ListRoleVo> toListRoleVoPage(PageInfo<SysRole> source) {
        if ( source == null ) {
            return null;
        }

        PageInfo<ListRoleVo> pageInfo = new PageInfo<ListRoleVo>();

        pageInfo.setPageNum( source.getPageNum() );
        pageInfo.setPageSize( source.getPageSize() );
        pageInfo.setTotal( source.getTotal() );
        pageInfo.setPages( source.getPages() );
        pageInfo.setList( sysRoleListToListRoleVoList( source.getList() ) );

        return pageInfo;
    }

    @Override
    public GetRoleDetailVo toGetRoleDetailVo(SysRole source) {
        if ( source == null ) {
            return null;
        }

        GetRoleDetailVo getRoleDetailVo = new GetRoleDetailVo();

        getRoleDetailVo.setId( source.getId() );
        getRoleDetailVo.setRoleName( source.getRoleName() );

        return getRoleDetailVo;
    }

    @Override
    public MenuDataItemVo toMenuDataItemVo(SysMenu source) {
        if ( source == null ) {
            return null;
        }

        MenuDataItemVo menuDataItemVo = new MenuDataItemVo();

        menuDataItemVo.setId( source.getId() );
        menuDataItemVo.setName( source.getName() );
        menuDataItemVo.setIcon( source.getIcon() );
        menuDataItemVo.setPath( source.getPath() );
        menuDataItemVo.setLayout( source.getLayout() );
        menuDataItemVo.setComponent( source.getComponent() );
        menuDataItemVo.setRedirect( source.getRedirect() );
        menuDataItemVo.setHideInMenu( source.getHideInMenu() );

        return menuDataItemVo;
    }

    @Override
    public List<MenuDataItemVo> toMenuDataItemVo(List<SysMenu> source) {
        if ( source == null ) {
            return null;
        }

        List<MenuDataItemVo> list = new ArrayList<MenuDataItemVo>( source.size() );
        for ( SysMenu sysMenu : source ) {
            list.add( toMenuDataItemVo( sysMenu ) );
        }

        return list;
    }

    protected ListSysResourceVo sysResourceToListSysResourceVo(SysResource sysResource) {
        if ( sysResource == null ) {
            return null;
        }

        ListSysResourceVo listSysResourceVo = new ListSysResourceVo();

        listSysResourceVo.setId( sysResource.getId() );
        listSysResourceVo.setName( sysResource.getName() );
        listSysResourceVo.setPid( sysResource.getPid() );
        listSysResourceVo.setPath( sysResource.getPath() );

        return listSysResourceVo;
    }

    protected ListRoleVo sysRoleToListRoleVo(SysRole sysRole) {
        if ( sysRole == null ) {
            return null;
        }

        ListRoleVo listRoleVo = new ListRoleVo();

        listRoleVo.setId( sysRole.getId() );
        listRoleVo.setRoleName( sysRole.getRoleName() );
        listRoleVo.setDisable( sysRole.getDisable() );

        return listRoleVo;
    }

    protected List<ListRoleVo> sysRoleListToListRoleVoList(List<SysRole> list) {
        if ( list == null ) {
            return null;
        }

        List<ListRoleVo> list1 = new ArrayList<ListRoleVo>( list.size() );
        for ( SysRole sysRole : list ) {
            list1.add( sysRoleToListRoleVo( sysRole ) );
        }

        return list1;
    }
}
