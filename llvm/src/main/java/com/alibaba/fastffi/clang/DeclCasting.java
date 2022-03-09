/*
 * Copyright 1999-2021 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastffi.clang;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXTemplate;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFISkip;
import com.alibaba.fastffi.FFITypeFactory;

/**
 * Casting from Type to a proper subtype of Type
 */
@FFIGen
@CXXHead("clang/AST/Decl.h")
@CXXHead("clang/AST/DeclCXX.h")
@CXXHead("clang/AST/DeclFriend.h")
@CXXHead("clang/AST/DeclTemplate.h")
@FFILibrary(value = "clang::Decl::Casting", namespace = "llvm")
public interface DeclCasting {

    DeclCastingGen INSTANCE = (DeclCastingGen) FFITypeFactory.getLibrary(DeclCasting.class);

    @CXXTemplate(cxx = {"clang::Decl", "clang::AccessSpecDecl"}, java = {"Decl", "AccessSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BindingDecl"}, java = {"Decl", "BindingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BlockDecl"}, java = {"Decl", "BlockDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BuiltinTemplateDecl"}, java = {"Decl", "BuiltinTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CapturedDecl"}, java = {"Decl", "CapturedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateDecl"}, java = {"Decl", "ClassTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateSpecializationDecl"}, java = {"Decl", "ClassTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplatePartialSpecializationDecl"}, java = {"Decl", "ClassTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassScopeFunctionSpecializationDecl"}, java = {"Decl", "ClassScopeFunctionSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConceptDecl"}, java = {"Decl", "ConceptDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConstructorUsingShadowDecl"}, java = {"Decl", "ConstructorUsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConstructorDecl"}, java = {"Decl", "CXXConstructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConversionDecl"}, java = {"Decl", "CXXConversionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDestructorDecl"}, java = {"Decl", "CXXDestructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDeductionGuideDecl"}, java = {"Decl", "CXXDeductionGuideDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXMethodDecl"}, java = {"Decl", "CXXMethodDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXRecordDecl"}, java = {"Decl", "CXXRecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclaratorDecl"}, java = {"Decl", "DeclaratorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DecompositionDecl"}, java = {"Decl", "DecompositionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EmptyDecl"}, java = {"Decl", "EmptyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumDecl"}, java = {"Decl", "EnumDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumConstantDecl"}, java = {"Decl", "EnumConstantDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExportDecl"}, java = {"Decl", "ExportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExternCContextDecl"}, java = {"Decl", "ExternCContextDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FieldDecl"}, java = {"Decl", "FieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FileScopeAsmDecl"}, java = {"Decl", "FileScopeAsmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendDecl"}, java = {"Decl", "FriendDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendTemplateDecl"}, java = {"Decl", "FriendTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionDecl"}, java = {"Decl", "FunctionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionTemplateDecl"}, java = {"Decl", "FunctionTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImplicitParamDecl"}, java = {"Decl", "ImplicitParamDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImportDecl"}, java = {"Decl", "ImportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::IndirectFieldDecl"}, java = {"Decl", "IndirectFieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LabelDecl"}, java = {"Decl", "LabelDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LifetimeExtendedTemporaryDecl"}, java = {"Decl", "LifetimeExtendedTemporaryDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LinkageSpecDecl"}, java = {"Decl", "LinkageSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSGuidDecl"}, java = {"Decl", "MSGuidDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSPropertyDecl"}, java = {"Decl", "MSPropertyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamedDecl"}, java = {"Decl", "NamedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceDecl"}, java = {"Decl", "NamespaceDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceAliasDecl"}, java = {"Decl", "NamespaceAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NonTypeTemplateParmDecl"}, java = {"Decl", "NonTypeTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ParmVarDecl"}, java = {"Decl", "ParmVarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaCommentDecl"}, java = {"Decl", "PragmaCommentDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaDetectMismatchDecl"}, java = {"Decl", "PragmaDetectMismatchDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RecordDecl"}, java = {"Decl", "RecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RedeclarableTemplateDecl"}, java = {"Decl", "RedeclarableTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RequiresExprBodyDecl"}, java = {"Decl", "RequiresExprBodyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::StaticAssertDecl"}, java = {"Decl", "StaticAssertDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TagDecl"}, java = {"Decl", "TagDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateDecl"}, java = {"Decl", "TemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTypeParmDecl"}, java = {"Decl", "TemplateTypeParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTemplateParmDecl"}, java = {"Decl", "TemplateTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TranslationUnitDecl"}, java = {"Decl", "TranslationUnitDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasDecl"}, java = {"Decl", "TypeAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasTemplateDecl"}, java = {"Decl", "TypeAliasTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeDecl"}, java = {"Decl", "TypeDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefDecl"}, java = {"Decl", "TypedefDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefNameDecl"}, java = {"Decl", "TypedefNameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingValueDecl"}, java = {"Decl", "UnresolvedUsingValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingTypenameDecl"}, java = {"Decl", "UnresolvedUsingTypenameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDecl"}, java = {"Decl", "UsingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDirectiveDecl"}, java = {"Decl", "UsingDirectiveDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingPackDecl"}, java = {"Decl", "UsingPackDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingShadowDecl"}, java = {"Decl", "UsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ValueDecl"}, java = {"Decl", "ValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarDecl"}, java = {"Decl", "VarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateDecl"}, java = {"Decl", "VarTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateSpecializationDecl"}, java = {"Decl", "VarTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplatePartialSpecializationDecl"}, java = {"Decl", "VarTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::DeclContext", "clang::Decl"}, java = {"DeclContext", "Decl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclContext"}, java = {"Decl", "DeclContext"})
    <@FFISkip From, To> To cast(From from, @FFISkip To unused);

    @CXXTemplate(cxx = {"clang::Decl", "clang::AccessSpecDecl"}, java = {"Decl", "AccessSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BindingDecl"}, java = {"Decl", "BindingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BlockDecl"}, java = {"Decl", "BlockDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BuiltinTemplateDecl"}, java = {"Decl", "BuiltinTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CapturedDecl"}, java = {"Decl", "CapturedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateDecl"}, java = {"Decl", "ClassTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateSpecializationDecl"}, java = {"Decl", "ClassTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplatePartialSpecializationDecl"}, java = {"Decl", "ClassTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassScopeFunctionSpecializationDecl"}, java = {"Decl", "ClassScopeFunctionSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConceptDecl"}, java = {"Decl", "ConceptDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConstructorUsingShadowDecl"}, java = {"Decl", "ConstructorUsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConstructorDecl"}, java = {"Decl", "CXXConstructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConversionDecl"}, java = {"Decl", "CXXConversionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDestructorDecl"}, java = {"Decl", "CXXDestructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDeductionGuideDecl"}, java = {"Decl", "CXXDeductionGuideDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXMethodDecl"}, java = {"Decl", "CXXMethodDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXRecordDecl"}, java = {"Decl", "CXXRecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclaratorDecl"}, java = {"Decl", "DeclaratorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DecompositionDecl"}, java = {"Decl", "DecompositionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EmptyDecl"}, java = {"Decl", "EmptyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumDecl"}, java = {"Decl", "EnumDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumConstantDecl"}, java = {"Decl", "EnumConstantDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExportDecl"}, java = {"Decl", "ExportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExternCContextDecl"}, java = {"Decl", "ExternCContextDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FieldDecl"}, java = {"Decl", "FieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FileScopeAsmDecl"}, java = {"Decl", "FileScopeAsmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendDecl"}, java = {"Decl", "FriendDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendTemplateDecl"}, java = {"Decl", "FriendTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionDecl"}, java = {"Decl", "FunctionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionTemplateDecl"}, java = {"Decl", "FunctionTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImplicitParamDecl"}, java = {"Decl", "ImplicitParamDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImportDecl"}, java = {"Decl", "ImportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::IndirectFieldDecl"}, java = {"Decl", "IndirectFieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LabelDecl"}, java = {"Decl", "LabelDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LifetimeExtendedTemporaryDecl"}, java = {"Decl", "LifetimeExtendedTemporaryDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LinkageSpecDecl"}, java = {"Decl", "LinkageSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSGuidDecl"}, java = {"Decl", "MSGuidDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSPropertyDecl"}, java = {"Decl", "MSPropertyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamedDecl"}, java = {"Decl", "NamedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceDecl"}, java = {"Decl", "NamespaceDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceAliasDecl"}, java = {"Decl", "NamespaceAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NonTypeTemplateParmDecl"}, java = {"Decl", "NonTypeTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ParmVarDecl"}, java = {"Decl", "ParmVarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaCommentDecl"}, java = {"Decl", "PragmaCommentDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaDetectMismatchDecl"}, java = {"Decl", "PragmaDetectMismatchDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RecordDecl"}, java = {"Decl", "RecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RedeclarableTemplateDecl"}, java = {"Decl", "RedeclarableTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RequiresExprBodyDecl"}, java = {"Decl", "RequiresExprBodyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::StaticAssertDecl"}, java = {"Decl", "StaticAssertDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TagDecl"}, java = {"Decl", "TagDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateDecl"}, java = {"Decl", "TemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTypeParmDecl"}, java = {"Decl", "TemplateTypeParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTemplateParmDecl"}, java = {"Decl", "TemplateTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TranslationUnitDecl"}, java = {"Decl", "TranslationUnitDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasDecl"}, java = {"Decl", "TypeAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasTemplateDecl"}, java = {"Decl", "TypeAliasTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeDecl"}, java = {"Decl", "TypeDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefDecl"}, java = {"Decl", "TypedefDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefNameDecl"}, java = {"Decl", "TypedefNameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingValueDecl"}, java = {"Decl", "UnresolvedUsingValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingTypenameDecl"}, java = {"Decl", "UnresolvedUsingTypenameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDecl"}, java = {"Decl", "UsingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDirectiveDecl"}, java = {"Decl", "UsingDirectiveDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingPackDecl"}, java = {"Decl", "UsingPackDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingShadowDecl"}, java = {"Decl", "UsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ValueDecl"}, java = {"Decl", "ValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarDecl"}, java = {"Decl", "VarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateDecl"}, java = {"Decl", "VarTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateSpecializationDecl"}, java = {"Decl", "VarTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplatePartialSpecializationDecl"}, java = {"Decl", "VarTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::DeclContext", "clang::Decl"}, java = {"DeclContext", "Decl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclContext"}, java = {"Decl", "DeclContext"})
    <@FFISkip From, To> To dyn_cast(From from, @FFISkip To unused);

    @CXXTemplate(cxx = {"clang::Decl", "clang::AccessSpecDecl"}, java = {"Decl", "AccessSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BindingDecl"}, java = {"Decl", "BindingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BlockDecl"}, java = {"Decl", "BlockDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::BuiltinTemplateDecl"}, java = {"Decl", "BuiltinTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CapturedDecl"}, java = {"Decl", "CapturedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassScopeFunctionSpecializationDecl"}, java = {"Decl", "ClassScopeFunctionSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateDecl"}, java = {"Decl", "ClassTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplateSpecializationDecl"}, java = {"Decl", "ClassTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ClassTemplatePartialSpecializationDecl"}, java = {"Decl", "ClassTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConceptDecl"}, java = {"Decl", "ConceptDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ConstructorUsingShadowDecl"}, java = {"Decl", "ConstructorUsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConstructorDecl"}, java = {"Decl", "CXXConstructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXConversionDecl"}, java = {"Decl", "CXXConversionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDestructorDecl"}, java = {"Decl", "CXXDestructorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXDeductionGuideDecl"}, java = {"Decl", "CXXDeductionGuideDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXMethodDecl"}, java = {"Decl", "CXXMethodDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::CXXRecordDecl"}, java = {"Decl", "CXXRecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclaratorDecl"}, java = {"Decl", "DeclaratorDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DecompositionDecl"}, java = {"Decl", "DecompositionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EmptyDecl"}, java = {"Decl", "EmptyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumDecl"}, java = {"Decl", "EnumDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::EnumConstantDecl"}, java = {"Decl", "EnumConstantDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExportDecl"}, java = {"Decl", "ExportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ExternCContextDecl"}, java = {"Decl", "ExternCContextDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FieldDecl"}, java = {"Decl", "FieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FileScopeAsmDecl"}, java = {"Decl", "FileScopeAsmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendDecl"}, java = {"Decl", "FriendDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FriendTemplateDecl"}, java = {"Decl", "FriendTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionDecl"}, java = {"Decl", "FunctionDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::FunctionTemplateDecl"}, java = {"Decl", "FunctionTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImplicitParamDecl"}, java = {"Decl", "ImplicitParamDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ImportDecl"}, java = {"Decl", "ImportDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::IndirectFieldDecl"}, java = {"Decl", "IndirectFieldDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LabelDecl"}, java = {"Decl", "LabelDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LifetimeExtendedTemporaryDecl"}, java = {"Decl", "LifetimeExtendedTemporaryDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::LinkageSpecDecl"}, java = {"Decl", "LinkageSpecDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSGuidDecl"}, java = {"Decl", "MSGuidDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::MSPropertyDecl"}, java = {"Decl", "MSPropertyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamedDecl"}, java = {"Decl", "NamedDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceDecl"}, java = {"Decl", "NamespaceDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NamespaceAliasDecl"}, java = {"Decl", "NamespaceAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::NonTypeTemplateParmDecl"}, java = {"Decl", "NonTypeTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ParmVarDecl"}, java = {"Decl", "ParmVarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaCommentDecl"}, java = {"Decl", "PragmaCommentDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::PragmaDetectMismatchDecl"}, java = {"Decl", "PragmaDetectMismatchDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RecordDecl"}, java = {"Decl", "RecordDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RedeclarableTemplateDecl"}, java = {"Decl", "RedeclarableTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::RequiresExprBodyDecl"}, java = {"Decl", "RequiresExprBodyDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::StaticAssertDecl"}, java = {"Decl", "StaticAssertDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TagDecl"}, java = {"Decl", "TagDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateDecl"}, java = {"Decl", "TemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTypeParmDecl"}, java = {"Decl", "TemplateTypeParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TemplateTemplateParmDecl"}, java = {"Decl", "TemplateTemplateParmDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TranslationUnitDecl"}, java = {"Decl", "TranslationUnitDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasDecl"}, java = {"Decl", "TypeAliasDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeAliasTemplateDecl"}, java = {"Decl", "TypeAliasTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypeDecl"}, java = {"Decl", "TypeDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefDecl"}, java = {"Decl", "TypedefDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::TypedefNameDecl"}, java = {"Decl", "TypedefNameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingValueDecl"}, java = {"Decl", "UnresolvedUsingValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UnresolvedUsingTypenameDecl"}, java = {"Decl", "UnresolvedUsingTypenameDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDecl"}, java = {"Decl", "UsingDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingDirectiveDecl"}, java = {"Decl", "UsingDirectiveDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingPackDecl"}, java = {"Decl", "UsingPackDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::UsingShadowDecl"}, java = {"Decl", "UsingShadowDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::ValueDecl"}, java = {"Decl", "ValueDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarDecl"}, java = {"Decl", "VarDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateDecl"}, java = {"Decl", "VarTemplateDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplateSpecializationDecl"}, java = {"Decl", "VarTemplateSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::VarTemplatePartialSpecializationDecl"}, java = {"Decl", "VarTemplatePartialSpecializationDecl"})
    @CXXTemplate(cxx = {"clang::DeclContext", "clang::Decl"}, java = {"DeclContext", "Decl"})
    @CXXTemplate(cxx = {"clang::Decl", "clang::DeclContext"}, java = {"Decl", "DeclContext"})
    <@FFISkip From, To> boolean isa(From from, @FFISkip To unused);
}
